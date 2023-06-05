package com.couchbase.demosimplecrudnative.sample;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Sample {
    String id;
    String name;
    String description;


}
