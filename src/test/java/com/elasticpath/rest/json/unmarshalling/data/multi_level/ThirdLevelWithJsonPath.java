/*
 * Copyright © 2014 Elastic Path Software Inc. All rights reserved.
 */

package com.elasticpath.rest.json.unmarshalling.data.multi_level;

import com.elasticpath.rest.json.unmarshalling.annotations.JsonPath;
/**
 * Test data class.
 */
@SuppressWarnings("PMD")
public class ThirdLevelWithJsonPath {

	//absolute path
	@JsonPath("$.second_level_array[1].third_level.field1")
	public String absoluteJsonPath;
}
