package be.msdc.xmlviewer_library

import androidx.compose.ui.graphics.Color

data class XmlColorScheme(
    val background: Color,
    val rootIcon: Color,
    val collapseIcon: Color,
    val nodeNameText: Color,
    val nodeInnerText: Color,
    val nodeMetadataKeyText: Color,
    val nodeMetadataValueText: Color,
    val nodeAttributeKeyText: Color,
    val nodeAttributeValueText: Color,
)

fun defaultColorScheme(
    background: Color = Color.LightGray,
    rootIcon: Color = Color(0xFFBF360C),
    collapseIcon: Color = Color(0xFFBF360C),
    nodeNameText: Color = Color(0xFFBF360C),
    nodeInnerText: Color = Color.Black,
    nodeMetadataKeyText: Color = Color(0xFF2E7D32),
    nodeMetadataValueText: Color = Color(0xFF2E7D32),
    nodeAttributeKeyText: Color = Color(0xFF2E7D32),
    nodeAttributeValueText: Color = Color(0xFF2E7D32),
): XmlColorScheme =
    XmlColorScheme(
        background = background,
        rootIcon = rootIcon,
        collapseIcon = collapseIcon,
        nodeNameText = nodeNameText,
        nodeInnerText = nodeInnerText,
        nodeMetadataKeyText = nodeMetadataKeyText,
        nodeMetadataValueText = nodeMetadataValueText,
        nodeAttributeKeyText = nodeAttributeKeyText,
        nodeAttributeValueText = nodeAttributeValueText,
    )