<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl"
>
  <xsl:output method="xml" indent="yes"/>
  <xsl:template match="/">
    <html>
      <h1><xsl:value-of select="ies/@nombre" /></h1>
      <xsl:for-each select="//ciclo">
        <p>
          <xsl:value-of select="nombre" />
        </p>
      </xsl:for-each>
    </html>
  </xsl:template>
</xsl:stylesheet>