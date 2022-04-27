package com.BrainFlux.CsvKafkaConsumerTest.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ImportCSVEvent {
    private Integer eventId;
    private Map<String,String> header;
    private RowData rowData;
}
