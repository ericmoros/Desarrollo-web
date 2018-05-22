<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl"
>
  <xsl:output method="xml" indent="yes"/>
  <xsl:template match="/">
    <socios-futbol>
      <xsl:for-each select="//equipo">
        <equipo>
          <xsl:attribute name="nombre">
            <xsl:value-of select="nombre"/>
          </xsl:attribute>
          <xsl:attribute name="socios">
            <xsl:value-of select="socios"/>
          </xsl:attribute>
        </equipo>
      </xsl:for-each>
    </socios-futbol>
  </xsl:template>
</xsl:stylesheet>
