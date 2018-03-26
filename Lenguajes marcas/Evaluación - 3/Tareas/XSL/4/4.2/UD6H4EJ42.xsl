﻿<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl"
>
  <xsl:output method="xml" indent="yes"/>
  <xsl:template match="/">
    <museos>
      <xsl:for-each select="//museo">
        <museo>
          <xsl:copy-of select="ciudad"/>
          <ubicacion>
            <xsl:attribute name="ciudad">
              <xsl:value-of select="ciudad"/>
            </xsl:attribute>
            <xsl:attribute name="pais">
              <xsl:value-of select="pais"/>
            </xsl:attribute>
          </ubicacion>
        </museo>
      </xsl:for-each>
    </museos>
  </xsl:template>
</xsl:stylesheet>