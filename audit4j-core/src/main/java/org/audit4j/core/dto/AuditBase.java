/*
 * Copyright 2014 Janith Bandara
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.audit4j.core.dto;

import java.io.Serializable;
import java.sql.Timestamp;

// TODO: Auto-generated Javadoc
/**
 * The Class AuditBaseDto.
 * 
 * @author Janith Bandara
 */
public class AuditBase implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8609566097133360680L;

	/** The audit id. */
	private Integer auditId;

	/** The uuid. */
	private Long uuid;

	/** The timestamp. */
	private Timestamp timestamp;

	/**
	 * Gets the audit id.
	 * 
	 * @return the audit id
	 */
	public Integer getAuditId() {
		return this.auditId;
	}

	/**
	 * Sets the audit id.
	 * 
	 * @param auditId
	 *            the new audit id
	 */
	public void setAuditId(final Integer auditId) {
		this.auditId = auditId;
	}

	/**
	 * Gets the uuid.
	 * 
	 * @return the uuid
	 */
	public Long getUuid() {
		return this.uuid;
	}

	/**
	 * Sets the uuid.
	 * 
	 * @param uuid
	 *            the new uuid
	 */
	public void setUuid(final Long uuid) {
		this.uuid = uuid;
	}

	/**
	 * Gets the timestamp.
	 * 
	 * @return the timestamp
	 */
	public Timestamp getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the timestamp.
	 * 
	 * @param timestamp
	 *            the new timestamp
	 */
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
}
