<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl"
>
  <xsl:output method="html" indent="yes"/>
  <xsl:template match="/">
    <html lang="es">
      <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <meta charset="UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
        <title>Ej - 3</title>
        <meta author="Eric Moros Pérez"/>
        <link rel="stylesheet" href="html.css"/>
      </head>
      <body>
        <table>
          <tbody>
            <tr>
              <th>Equipo</th>
              <th>Ligas</th>
              <th>Copas</th>
              <th>Fundación</th>
            </tr>
            <xsl:for-each select="//equipo">
              <tr>
                <td>
                  <xsl:value-of select="nombre"/>
                </td>
                <td>
                  <xsl:value-of select="ligas"/>
                </td>
                <td>
                  <xsl:value-of select="copas"/>
                </td>
                <td>
                  <xsl:value-of select="fundacion"/>
                </td>
              </tr>
            </xsl:for-each>
          </tbody>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>