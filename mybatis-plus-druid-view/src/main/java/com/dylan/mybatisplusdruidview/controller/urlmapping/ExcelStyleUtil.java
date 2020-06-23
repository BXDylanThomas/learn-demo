package com.dylan.mybatisplusdruidview.controller.urlmapping;

import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.metadata.style.WriteFont;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import org.apache.poi.ss.usermodel.*;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/6/23 21:17
 */
public class ExcelStyleUtil {

	public static HorizontalCellStyleStrategy globleStyle(){
		// 头的样式
		WriteCellStyle headStyle = new WriteCellStyle();
		headStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
		WriteFont headFont = new WriteFont();
		headFont.setBold(true);
		headFont.setFontHeightInPoints((short) 16);
		headStyle.setWriteFont(headFont);
		headStyle.setWrapped(true);

		// 内容的样式
		WriteCellStyle contentStyle = new WriteCellStyle();
		contentStyle.setFillPatternType(FillPatternType.SOLID_FOREGROUND);
		contentStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
		WriteFont contentWriteFont = new WriteFont();
		contentWriteFont.setFontHeightInPoints((short) 12);
		contentStyle.setWriteFont(contentWriteFont);
		contentStyle.setBorderTop(BorderStyle.THIN);
		contentStyle.setBorderBottom(BorderStyle.THIN);
		contentStyle.setBorderLeft(BorderStyle.THIN);
		contentStyle.setBorderRight(BorderStyle.THIN);
		contentStyle.setHorizontalAlignment(HorizontalAlignment.CENTER);
		contentStyle.setVerticalAlignment(VerticalAlignment.CENTER);
		contentStyle.setWrapped(true);
		return new HorizontalCellStyleStrategy(headStyle, contentStyle);
	}

	/**
	 * 设置样式
	 *
	 * @return
	 */
	private static HorizontalCellStyleStrategy cellStyle() {
		// 头的策略
		WriteCellStyle headWriteCellStyle = new WriteCellStyle();
		// 背景设置为红色
		headWriteCellStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
		// 设置底边框;
		headWriteCellStyle.setBorderBottom(BorderStyle.THIN);
		// 设置底边框颜色;
		headWriteCellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
		// 设置左边框;
		headWriteCellStyle.setBorderLeft(BorderStyle.THIN);
		// 设置左边框颜色;
		headWriteCellStyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
		// 设置右边框;
		headWriteCellStyle.setBorderRight(BorderStyle.THIN);
		// 设置右边框颜色;
		headWriteCellStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());
		// 设置顶边框;
		headWriteCellStyle.setBorderTop(BorderStyle.THIN);
		// 设置顶边框颜色;
		headWriteCellStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
		// 设置自动换行
		headWriteCellStyle.setWrapped(true);
		// 设置垂直居中
		headWriteCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
		// 设置水平居中
		headWriteCellStyle.setHorizontalAlignment(HorizontalAlignment.CENTER);
		WriteFont headWriteFont = new WriteFont();
		headWriteFont.setFontHeightInPoints((short) 15);
		headWriteCellStyle.setWriteFont(headWriteFont);


		// 内容的策略
		WriteCellStyle contentWriteCellStyle = new WriteCellStyle();
		// 设置底边框;
		contentWriteCellStyle.setBorderBottom(BorderStyle.THIN);
		// 设置底边框颜色;
		contentWriteCellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
		// 设置左边框;
		contentWriteCellStyle.setBorderLeft(BorderStyle.THIN);
		// 设置左边框颜色;
		contentWriteCellStyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
		// 设置右边框;
		contentWriteCellStyle.setBorderRight(BorderStyle.THIN);
		// 设置右边框颜色;
		contentWriteCellStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());
		// 设置顶边框;
		contentWriteCellStyle.setBorderTop(BorderStyle.THIN);
		// 设置顶边框颜色;
		contentWriteCellStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
		// 设置自动换行
		contentWriteCellStyle.setWrapped(true);
		// 设置垂直居中
		contentWriteCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
		// 设置水平居中
		contentWriteCellStyle.setHorizontalAlignment(HorizontalAlignment.CENTER);
		WriteFont contentWriteFont = new WriteFont();
		// 字体大小
		contentWriteFont.setFontHeightInPoints((short) 12);
		contentWriteCellStyle.setWriteFont(contentWriteFont);
		// 这个策略是 头是头的样式 内容是内容的样式 其他的策略可以自己实现
		HorizontalCellStyleStrategy horizontalCellStyleStrategy = new HorizontalCellStyleStrategy(headWriteCellStyle, contentWriteCellStyle);
		return horizontalCellStyleStrategy;
	}

}
