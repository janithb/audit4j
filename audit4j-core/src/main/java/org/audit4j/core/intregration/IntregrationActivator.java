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

package org.audit4j.core.intregration;

/**
 * The Interface IntregrationActivator.
 *
 * @author <a href="mailto:janith3000@gmail.com">Janith Bandara</a>
 */
public interface IntregrationActivator {

	/**
	 * Will start.
	 */
	public void willStart();

	/**
	 * Started.
	 */
	public void started();

}
