package com.dylan.mybatisplusdruidview.controller.urlmapping;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.merge.AbstractMergeStrategy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;

import java.util.HashMap;
import java.util.Map;

/**
 * @author baoxiang
 * @create 2020-06-22 9:42
 */
public class MergeStrategy  extends AbstractMergeStrategy {
    //合并的列数
    private Map<Integer,Column> columnMap = new HashMap<>();

    public MergeStrategy(Map<Integer,Column> columnMap) {
        this.columnMap = columnMap;
    }

    @Override
    protected void merge(Sheet sheet, Cell cell, Head head, Integer integer) {
        int row =cell.getRow().getRowNum() +1;
        columnMap.forEach((k,v)->{
            if (cell.getColumnIndex() == k && v.getRowEnd() == row){
                sheet.addMergedRegion(new CellRangeAddress(v.getRowStart(),v.getRowEnd(), v.getColStart(), v.getColEnd()));
            }
        });
    }

    @Data@NoArgsConstructor
    public static class Column{
        private int rowStart;
        private int rowEnd ;
        private int colStart;
        private int colEnd;

        public Column(int rowStart, int rowEnd, int colStart, int colEnd) {
            this.rowStart = rowStart;
            this.rowEnd = rowEnd;
            this.colStart = colStart;
            this.colEnd = colEnd;
        }
    }

}
 