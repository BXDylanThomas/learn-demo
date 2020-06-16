package org.example.write.demo1;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.merge.AbstractMergeStrategy;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 * code is far away from bug with the animal protecting
 *
 * 合并
 *
 * @Author : dylan
 * @Date :create in 2020/6/16 23:21
 */
public class DemoMergeStrategy extends AbstractMergeStrategy {

	private final int subjectLength;
	private final int nameLength;
	private int nextMerge1 = 0;
	private int nextMerge2 = 0;

	public DemoMergeStrategy(int subjectLength, int nameLength) {
		this.subjectLength = subjectLength;
		this.nameLength = nameLength;
	}

	@Override
	protected void merge(Sheet sheet, Cell cell, Head head, Integer relativeRowIndex) {
		// 由于每个单元格单元格都会调用该方法，为了避免重复合并异常，只在应合并的行、列执行即可
		// relativeRowIndex == 0，即表内容的第一行（除去表头）
		if (cell.getColumnIndex() == 0) {
			if (relativeRowIndex == 0 || relativeRowIndex == nextMerge1) {
				int lastRow = subjectLength * nameLength;
				nextMerge1 = relativeRowIndex + lastRow;
				CellRangeAddress cellRangeAddress = new CellRangeAddress(cell.getRowIndex(), cell.getRowIndex() + lastRow - 1, 0, 0);
				sheet.addMergedRegionUnsafe(cellRangeAddress);
			}
		} else if (cell.getColumnIndex() == 1) {
			if (relativeRowIndex == 0 || relativeRowIndex == nextMerge2) {
				int lastRow = subjectLength;
				nextMerge2 = relativeRowIndex + lastRow;
				CellRangeAddress cellRangeAddress = new CellRangeAddress(cell.getRowIndex(), cell.getRowIndex() + lastRow - 1, 1, 1);
				sheet.addMergedRegionUnsafe(cellRangeAddress);
			}
		} else if (cell.getColumnIndex() == 2) {
			int first = subjectLength - 1;
			if (relativeRowIndex == first || (relativeRowIndex - first) % subjectLength == 0) {
				sheet.addMergedRegionUnsafe(new CellRangeAddress(cell.getRowIndex(), cell.getRowIndex(), cell.getColumnIndex(), cell.getColumnIndex() + 3));
			}
		}
	}
}
