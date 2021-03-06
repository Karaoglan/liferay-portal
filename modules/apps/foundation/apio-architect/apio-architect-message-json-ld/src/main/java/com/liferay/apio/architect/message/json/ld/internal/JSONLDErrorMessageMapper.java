/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.apio.architect.message.json.ld.internal;

import com.liferay.apio.architect.message.json.ErrorMessageMapper;
import com.liferay.apio.architect.message.json.JSONObjectBuilder;

import org.osgi.service.component.annotations.Component;

/**
 * Represents errors in JSON-LD + Hydra format.
 *
 * <p>
 * For more information, see <a href="https://json-ld.org/">JSON-LD </a> and <a
 * href="https://www.hydra-cg.com/">Hydra </a> .
 * </p>
 *
 * @author Alejandro Hernández
 */
@Component(immediate = true)
public class JSONLDErrorMessageMapper implements ErrorMessageMapper {

	@Override
	public String getMediaType() {
		return "application/ld+json";
	}

	@Override
	public void mapDescription(
		JSONObjectBuilder jsonObjectBuilder, String description) {

		jsonObjectBuilder.field(
			"description"
		).stringValue(
			description
		);
	}

	@Override
	public void mapStatusCode(
		JSONObjectBuilder jsonObjectBuilder, Integer statusCode) {

		jsonObjectBuilder.field(
			"statusCode"
		).numberValue(
			statusCode
		);
	}

	@Override
	public void mapTitle(JSONObjectBuilder jsonObjectBuilder, String title) {
		jsonObjectBuilder.field(
			"title"
		).stringValue(
			title
		);
	}

	@Override
	public void mapType(JSONObjectBuilder jsonObjectBuilder, String type) {
		jsonObjectBuilder.field(
			"@type"
		).stringValue(
			type
		);
	}

}