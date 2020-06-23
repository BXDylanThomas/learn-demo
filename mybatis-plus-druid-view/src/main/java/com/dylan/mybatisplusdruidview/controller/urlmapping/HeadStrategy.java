package com.dylan.mybatisplusdruidview.controller.urlmapping;

import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.handler.CellWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import java.util.List;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/6/23 21:13
 */
public class HeadStrategy implements CellWriteHandler {

	private int end;

	public HeadStrategy(int end) {
		this.end = end;
	}

	@Override
	public void beforeCellCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Row row, Head head, Integer columnIndex, Integer relativeRowIndex, Boolean isHead) {
		if (isHead) {
			Sheet sheet = writeSheetHolder.getSheet();
			CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
			cellStyle.setFillForegroundColor(IndexedColors.LIGHT_TURQUOISE.getIndex());
			//只设置颜色不起作用
			cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			sheet.addMergedRegion(new CellRangeAddress(0,0,0,end));
		}
	}

	@Override
	public void afterCellCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Cell cell, Head head, Integer relativeRowIndex, Boolean isHead) {

	}

	@Override
	public void afterCellDataConverted(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, CellData cellData, Cell cell, Head head, Integer relativeRowIndex, Boolean isHead) {

	}

	@Override
	public void afterCellDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, List<CellData> cellDataList, Cell cell, Head head, Integer relativeRowIndex, Boolean isHead) {

	}
}
