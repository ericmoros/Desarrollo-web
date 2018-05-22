<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl"
>
  <xsl:output method="xml" indent="yes"/>
  <xsl:template match="/">
    <socios-futbol>
      <xsl:for-each select="//equipo[ligas > 0]">
        <xsl:sort order="descending" select="ligas"/>
        <equipo>
          <xsl:copy-of select="nombre"/>
          <xsl:copy-of select="ligas"/>
        </equipo>
      </xsl:for-each>
    </socios-futbol>
  </xsl:template>
</xsl:stylesheet>