<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:msxsl="urn:schemas-microsoft-com:xslt" exclude-result-prefixes="msxsl" xmlns:exslt="http://exslt.org/common"
>
  <xsl:output method="html" indent="yes"/>
  <xsl:template name="renderTable">
    <xsl:param name="array"/>
      <xsl:for-each select="exslt:node-set($array)//item">
        <h2>
          Edificio <xsl:value-of select="."/>
        </h2>
        <xsl:for-each select="//lugar/@edificio">
          <table>
            <xsl:if test=". = .">
              <tr>
                <td>
                  <xsl:value-of select="../../nombre"/>
                </td>
                <td>
                  <xsl:value-of select="../../peso"/>
                  <xsl:value-of select="../../peso/@unidad"/>
                </td>
                <td>
                  <xsl:value-of select="."/>
                  <xsl:value-of select="aula"/>
                </td>
              </tr>
            </xsl:if>
          </table>
        </xsl:for-each>
      </xsl:for-each>
  </xsl:template>
  <xsl:template match="/">
    <xsl:variable name="myArray">
      <array>
        <item>value1</item>
        <item>value2</item>
        <item>value3</item>
      </array>
    </xsl:variable>
    <html lang="es">
      <head>
        <meta charset="UTF-8">
          <meta name="viewport" content="width=device-width, initial-scale=1.0" />
          <meta http-equiv="X-UA-Compatible" content="ie=edge" />
          <meta author="Eric Moros Pérez" />
          <title>EJ-2</title>
          <style>
            table, tr, td {
            border: 1px ridge black;
            }
          </style>
        </meta>
      </head>
      <body>
        <xsl:call-template name="renderTable">
            <xsl:with-param name="array" select="$myArray"/>
        </xsl:call-template>
        <h2>
          Edificio A<!--<xsl:value-of select="."/>-->
        </h2>
        <xsl:for-each select="//lugar/@edificio">
          <table>
            <xsl:if test=". = 'A'">
              <tr>
                <td>
                  <xsl:value-of select="../../nombre"/>
                </td>
                <td>
                  <xsl:value-of select="../../peso"/>
                  <xsl:value-of select="../../peso/@unidad"/>
                </td>
                <td>
                  <xsl:value-of select="."/>
                  <xsl:value-of select="aula"/>
                </td>
              </tr>
            </xsl:if>
          </table>
        </xsl:for-each>
        <h2>
          Edificio B<!--<xsl:value-of select="."/>-->
        </h2>
        <xsl:for-each select="//lugar/@edificio">
          <table>
            <xsl:if test=". = 'B'">
              <tr>
                <td>
                  <xsl:value-of select="../../nombre"/>
                </td>
                <td>
                  <xsl:value-of select="../../peso"/>
                  <xsl:value-of select="../../peso/@unidad"/>
                </td>
                <td>
                  <xsl:value-of select="."/>
                  <xsl:value-of select="aula"/>
                </td>
              </tr>
            </xsl:if>
          </table>
        </xsl:for-each>
      </body>
    </html>
    <!--<xsl:for-each select="//producto">
      <xsl:if test="lugar/@edificio = 'B'">
        <xsl:copy-of select="."/>
      </xsl:if>
    </xsl:for-each>-->
  </xsl:template>
</xsl:stylesheet>