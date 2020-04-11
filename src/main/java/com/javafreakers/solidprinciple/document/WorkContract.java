package com.javafreakers.solidprinciple.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WorkContract implements ExportableText, ExportablePDF, ExportableJson {
    private String content;

    @Override
    public String toJson() {
        return "{ 'content':'" + content + "'}";
    }

    @Override
    public byte[] toPDF() {
        return this.content.getBytes();
    }

    @Override
    public String toTxt() {
        return content;
    }
}
