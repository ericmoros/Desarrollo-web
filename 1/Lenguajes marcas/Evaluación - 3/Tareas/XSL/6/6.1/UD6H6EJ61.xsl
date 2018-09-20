<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl"
>
  <xsl:output method="xml" indent="yes"/>
  <xsl:template match="/">
    <inventario>
      <xsl:for-each select="//producto">
        <xsl:if test="lugar/@edificio = 'B'">
          <xsl:copy-of select="."/>
        </xsl:if>
      </xsl:for-each>
    </inventario>
  </xsl:template>
</xsl:stylesheet>