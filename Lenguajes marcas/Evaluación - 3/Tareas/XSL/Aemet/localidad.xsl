<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl"
>
  <xsl:output method="html" indent="yes"/>
  <xsl:template match="/">
    <html lang="en">
      <head>
        <meta charset="UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
        <meta author="Eric Moros Pérez"/>
        <title>Aemet-viewer</title>
        <style>
          h1 {
          color: blue;
          text-align: center;
          }
          h3 {
          color: red;
          }
        </style>
      </head>
      <body>
        <h1>
          El tiempo de <xsl:value-of select="root/nombre"/>
        </h1>
        <h2>
          Predicciones
        </h2>
        <xsl:for-each select="root/prediccion/dia">
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
        </xsl:for-each>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>