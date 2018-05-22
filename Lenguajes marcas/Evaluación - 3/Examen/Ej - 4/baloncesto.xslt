<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl"
>
  <xsl:output method="xml" indent="yes"/>
  <xsl:template match="/">
    <baloncesto>
      <xsl:for-each select="//equipo[ligas > 0]">
        <equipo>
          <xsl:copy-of select="nombre"/>
          <xsl:copy-of select="ligas"/>
        </equipo>
      </xsl:for-each>
    </baloncesto>
  </xsl:template>
</xsl:stylesheet>