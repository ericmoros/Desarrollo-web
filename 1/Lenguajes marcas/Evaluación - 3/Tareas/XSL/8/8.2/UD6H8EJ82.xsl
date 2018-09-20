<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl"
>
  <xsl:output method="xml" indent="yes"/>
  <xsl:template match="/">
    <xsl:for-each select="//Miembro">
        <xsl:for-each select="Telefono"><xsl:if test="@tipo = 'casa'">casa:<xsl:value-of select="."/></xsl:if><xsl:if test="@tipo = 'trabajo'">trabajo:<xsl:value-of select="."/></xsl:if></xsl:for-each></xsl:for-each>
  </xsl:template>
</xsl:stylesheet>