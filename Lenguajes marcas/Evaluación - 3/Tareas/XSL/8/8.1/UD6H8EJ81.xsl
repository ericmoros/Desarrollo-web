<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl"
>
  <xsl:output method="xml" indent="yes"/>
  <xsl:template match="/">
    
    Los miembros del centro son:
    
    <xsl:for-each select="//Miembro">
        Nombre: <xsl:value-of select="Nombre"/>
        Membresía: <xsl:value-of select="@nivel"/>
    </xsl:for-each>
  </xsl:template>
</xsl:stylesheet>