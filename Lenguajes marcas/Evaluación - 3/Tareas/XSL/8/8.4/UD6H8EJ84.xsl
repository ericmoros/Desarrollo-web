<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl"
>
  <xsl:output method="xml" indent="yes"/>
  <xsl:template match="/">
        <xsl:for-each select="//Miembro">
          <xsl:sort select="Nombre"/>
          <xsl:text>
    </xsl:text>
          <xsl:text>
    </xsl:text>
          <xsl:value-of select="Nombre"/>
          <xsl:text>
    </xsl:text>
          <xsl:for-each select="Telefono">
            <xsl:value-of select="."/>
            <xsl:text>
    </xsl:text>
          </xsl:for-each>
          <xsl:value-of select="Casilla"/>
        </xsl:for-each>
  </xsl:template>
</xsl:stylesheet>