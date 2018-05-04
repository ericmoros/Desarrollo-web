<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl" xmlns:exsl="http://exslt.org/common" xmlns:exslt="http://exslt.org/common"
>
  <xsl:output method="html" indent="yes"/>
  <xsl:template name="render-periodos">
    <xsl:param name="array"/>
    <xsl:for-each select="exslt:node-set($array)//periodo[not(.=preceding::*)]">
      <hour>
        <xsl:value-of select="."/>
      </hour>
    </xsl:for-each>
  </xsl:template>
  <xsl:template name="render-hours">
    <xsl:param name="array"/>
    <xsl:for-each select="exslt:node-set($array)//hour">
      <p>
        <xsl:value-of select="."/>
      </p>
    </xsl:for-each>
  </xsl:template>
  <xsl:template match="/">
    <html lang="es">
      <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta http-equiv="X-UA-Compatible" content="ie=edge" />
        <title>Diseño Aemet ZGZ</title>
        <meta author="Eric Moros Pérez" />
        <!-- STYLES -->
        <link rel="stylesheet" href="index.css" />
      </head>
      <body>
        <h1>
          <xsl:value-of select="root/nombre"/>
        </h1>
        <div id="data">
          <xsl:for-each select="root/prediccion/dia">
            <xsl:variable name="day" select=".">
            </xsl:variable>
            <xsl:variable name="periodos">
              <array>
                <xsl:for-each select="node()/@periodo">
                  <periodo>
                    <xsl:value-of select="."/>
                  </periodo>
                </xsl:for-each>
              </array>
            </xsl:variable>
            <xsl:variable name="hours">
              <xsl:call-template name="render-periodos">
                <xsl:with-param name="array" select="$periodos"/>
              </xsl:call-template>
            </xsl:variable>
            <div class="day">
              <xsl:attribute name="id">
                <xsl:value-of select="@fecha"/>
              </xsl:attribute>
              <h2 class="week-day">
                <xsl:value-of select="@fecha"/>
              </h2>
              <xsl:for-each select="exsl:node-set($hours)/hour">
                <xsl:variable name="hour" select="."/>
                <xsl:variable name="sky" select="$day/estado_cielo[@periodo = $hour]/@descripcion"/>
                <div class="hour" onclick="toggleInfo()">
                  <xsl:attribute name="id">
                    <xsl:value-of select="$hour"/>
                  </xsl:attribute>
                  <div class="info-min">
                    <div class="info-min-1">
                      <h3>
                        <xsl:value-of select="$hour"/>
                      </h3>
                      <p class="sky">
                        <xsl:choose>
                          <xsl:when test="$sky != ''">
                            <xsl:value-of select="$sky"/>
                          </xsl:when>
                          <xsl:otherwise>
                            <xsl:attribute name="class">sky-null</xsl:attribute>
                          </xsl:otherwise>
                        </xsl:choose>
                      </p>
                      <p class="prep">Humedad: <xsl:value-of select="$day/humedad_relativa/dato[(@hora = substring($hour, 1, 2)) or (@hora - 24 = substring($hour, 1, 2))]"/>%</p>
                    </div>
                    <div class="info-min-2">
                      <xsl:variable name="temperature" select="$day/temperatura/dato[(@hora = substring($hour, 1, 2)) or (@hora - 24 = substring($hour, 1, 2))]"/>
                      <p class="temperature"><xsl:choose><xsl:when test="$temperature != ''"><xsl:value-of select="$temperature"/></xsl:when><xsl:otherwise>??</xsl:otherwise></xsl:choose>ºC</p>
                      <p class="temperature-2"><xsl:value-of select="$day/temperatura/minima"/>/<xsl:value-of select="$day/temperatura/maxima"/>ºC</p>
                    </div>
                    <div class="time">
                      <img src="img/null.png" alt="sun">
                        <xsl:choose>
                          <xsl:when test="$sky != ''">
                            <xsl:attribute name="src">
                              <!-- normalize-space() evitará espacios a la izquierda y a la derecha de la cadena, luego todos los espacios interiores serán reemplazados por '-' -->
                              <xsl:value-of select="concat('img/', translate(translate(normalize-space($sky), ' ', '-'), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '.png')"/>
                            </xsl:attribute>
                            <xsl:attribute name="alt">
                              <xsl:value-of select="$sky"/>
                            </xsl:attribute>
                          </xsl:when>
                        </xsl:choose>
                      </img>
                    </div>
                  </div>
                  <div class="info">
                    <table class="info-table" id="19:00">
                      <tbody>
                        <tr>
                          <th>Prediciones</th>
                          <th>Resultados</th>
                        </tr>
                        <tr>
                          <td>Lluvia</td>
                          <xsl:variable name="rain" select="$day/prob_precipitacion[(@periodo = $hour) or (concat(substring(@periodo, 1, 2) - 24, substring(@periodo, 3, 5)) = $hour) or (. != '')]"/>
                          <td><xsl:choose><xsl:when test="$rain != ''"><xsl:value-of select="$rain"/></xsl:when><xsl:otherwise>?</xsl:otherwise></xsl:choose>%</td>
                        </tr>
                        <tr>
                          <td>Viento</td>
                          <xsl:variable name="wind" select="$day/viento[(@periodo = $hour) or (concat(substring(@periodo, 1, 2) - 24, substring(@periodo, 3, 5)) = $hour)]"/>
                          <td><xsl:choose><xsl:when test="$wind/direccion != ''"><xsl:value-of select="$wind/direccion"/></xsl:when><xsl:otherwise>?</xsl:otherwise></xsl:choose>-<xsl:choose><xsl:when test="$wind/velocidad != ''"><xsl:value-of select="$wind/velocidad"/></xsl:when><xsl:otherwise>?</xsl:otherwise></xsl:choose>km/h</td>
                        </tr>
                        <tr>
                          <td>Nieve</td>
                          <xsl:variable name="snow" select="$day/cota_nieve_prov[(@periodo = $hour) or (concat(substring(@periodo, 1, 2) - 24, substring(@periodo, 3, 5)) = $hour)]"/>
                          <td><xsl:choose><xsl:when test="$snow != ''"><xsl:value-of select="$snow"/></xsl:when><xsl:otherwise>?</xsl:otherwise></xsl:choose></td>
                        </tr>
                        <tr>
                          <td>Sensación térmica</td>
                          <xsl:variable name="wind-chill" select="$day/sens_termica"/>
                          <td><xsl:value-of select="$wind-chill/minima"/>/<xsl:value-of select="$wind-chill/maxima"/>ºC</td>
                        </tr>
                        <tr>
                          <td>Radiación Ultra violeta</td>
                          <td><xsl:value-of select="$day/uv_max"/></td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
              </xsl:for-each>
            </div>
          </xsl:for-each>
        </div>
        <!--<xsl:for-each select="root/prediccion/dia">
          <div>
            <h3>
              <xsl:value-of select="@fecha"/>
            </h3>
            <h4>Probabilidades de lluvia</h4>
            <xsl:for-each select="prob_precipitacion">
              <p></p>
            </xsl:for-each>
            <h4>Probabilidades de nive</h4>
            <xsl:for-each select="cota_nieve_prov">
              <p></p>
            </xsl:for-each>
            <h4>Estado del cielo</h4>
            <xsl:for-each select="estado_cielo">
              <p></p>
            </xsl:for-each>
            <h4>Viento</h4>
            <xsl:for-each select="viento">
              <p></p>
            </xsl:for-each>
            <h4>Rachas máximas</h4>
            <xsl:for-each select="racha_max">
              <p></p>
            </xsl:for-each>
            <h4>Temperaturas</h4>
            <p>
              <xsl:value-of select="temperatura"/>
            </p>
            <h4>Sensación térmica</h4>
            <p>
              <xsl:value-of select="sens_termica"/>
            </p>
            <h4>Humedad</h4>
            <p>
              <xsl:value-of select="humedad_relativa"/>
            </p>
            <p>
              <xsl:value-of select="uv_max"/>
            </p>
          </div>
        </xsl:for-each>-->
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>