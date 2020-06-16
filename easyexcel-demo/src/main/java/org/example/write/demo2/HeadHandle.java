package org.example.write.demo2;

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
 * @Date :create in 2020/6/16 21:29
 */
public class HeadHandle implements CellWriteHandler {
	@Override
	public void beforeCellCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder,
								 Row row, Head head, Integer columnIndex, Integer relativeRowIndex, Boolean isHead) {
		if (isHead) {
			Sheet sheet = writeSheetHolder.getSheet();
			CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
			sheet.addMergedRegion(new CellRangeAddress(0,3,0,5));
		}
		if (relativeRowIndex == 5){
			Sheet sheet = writeSheetHolder.getSheet();
			CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
			cellStyle.setFillForegroundColor(IndexedColors.LIGHT_TURQUOISE.getIndex());
			//只设置颜色不起作用
			cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			sheet.getRow(relativeRowIndex).getCell(columnIndex).setCellStyle(cellStyle);
//			cell.setCellStyle(cellStyle);
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
