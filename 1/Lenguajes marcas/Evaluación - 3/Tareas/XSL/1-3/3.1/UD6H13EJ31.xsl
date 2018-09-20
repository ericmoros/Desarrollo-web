<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl"
>
  <xsl:output method="xml" indent="yes"/>
  <xsl:template match="/">
    <html>
      <h1>Ciclos formativos del IES <xsl:value-of select="/ies/@nombre"/></h1>
      <p>Página web: <a><xsl:attribute name="href"><xsl:value-of select="/ies/@web"/></xsl:attribute><xsl:value-of select="/ies/@web"/></a></p>
        <xsl:for-each select="//ciclo">
          <ul>
            <li>
              <xsl:value-of select="@id"/><br /><xsl:value-of select="nombre"/> ciclo formativo de <xsl:value-of select="grado"/> creado en <xsl:value-of select="decretoTitulo/@año"/>
            </li>
          </ul>
        </xsl:for-each>
    </html>
  </xsl:template>
</xsl:stylesheet>