<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : cd.xsl
    Created on : 20 April 2018, 11:45 AM
    Author     : J-Mo
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="cd">
        <html>
            <head>
                <style>
                    table.tracklist { border: solid 1px black; border-collapse: collapse; }
                    table.tracklist td { border: solid 1px #999; }
                    .artist { font-style: italic; margin-bottom: 20px; }
                    .even { background: #fff; }
                    .odd { background: #f2f2f2; }
                </style>
            </head>
            <body>
                <xsl:apply-templates/>
                <p>Total number of tracks: <xsl:value-of select="count(tracklist/track)"/></p>
                <p>Average track rating: <xsl:value-of select="sum(tracklist/track/rating) div count(tracklist/track)"/></p>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="cd/title">
               <h1><xsl:apply-templates/></h1>
    </xsl:template>
    
    <xsl:template match="artist">
               <div class="artist"><xsl:apply-templates/></div>
    </xsl:template>
    
    <xsl:template match="cd/tracklist">
               <table class="tracklist">
                    <thead>
                        <tr>
                            <th>Track</th>
                            <th>Info</th>
                            <th>Rating</th>
                        </tr>
                    </thead>
                    <tbody>
                        <xsl:apply-templates/>
                    </tbody>
               </table>
    </xsl:template>
    
    <xsl:template match="track">
        <xsl:variable name="class">
            <xsl:choose>
                <xsl:when test="@id mod 2 = 0">even</xsl:when>
                <xsl:otherwise>odd</xsl:otherwise>
            </xsl:choose>
        </xsl:variable>
               <tr class="{$class}">
                   <td>#<xsl:value-of select="@id"/></td>
                   <td><xsl:value-of select="time"/> - <xsl:value-of select="title"/></td>
                   <td><div style="width: {2*10*rating}px; height: 12px; background: blue;"></div></td>
               </tr>
    </xsl:template>
</xsl:stylesheet>