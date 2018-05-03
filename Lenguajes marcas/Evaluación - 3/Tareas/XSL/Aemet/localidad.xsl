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
              <!--<xsl:value-of select="."/>-->
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
                      <xsl:value-of select="$day/estado_cielo[@periodo = $hour]/@descripcion"/>
                    </p>
                    <p class="prep">Humedad: <xsl:value-of select="$day/humedad_relativa/dato[@hora = substring($hour, 1, 2)]"/>%</p>
                    <!--<p class="prep">
                      Humedad: <xsl:value-of
                      select="$day/humedad_relativa/dato[@hora =
                        if(24 != substring($hour, 1, 2)) then
                          substring($hour, 1, 2)
                        else
                          24]"/>%
                    </p>
                    <p class="prep">
                      Humedad: <xsl:value-of
                      select="$day/humedad_relativa/dato
                        if(@hora = substring($hour, 1, 2)) then
                          .
                        else if (@hora = '24') then
                          .
                        else
                          'null'"/>%
                    </p>-->
                  </div>
                  <div class="info-min-2">
                    <p class="temperature">35ºC</p>
                    <p class="temperature-2">20/37ºC</p>
                  </div>
                  <div class="time">
                    <img src="img/sun.png" alt="sun" />
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
                        <td>0%</td>
                      </tr>
                      <tr>
                        <td>Viento</td>
                        <td>SE-15km/h</td>
                      </tr>
                      <tr>
                        <td>Nieve</td>
                        <td>0%</td>
                      </tr>
                      <tr>
                        <td>Sensación térmica</td>
                        <td>11/25ºC</td>
                      </tr>
                      <tr>
                        <td>Radiación Ultra violeta</td>
                        <td>7</td>
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