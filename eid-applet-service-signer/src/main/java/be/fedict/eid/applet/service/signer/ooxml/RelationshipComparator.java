/*
 * eID Applet Project.
 * Copyright (C) 2009-2014 e-Contract.be BVBA.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version
 * 3.0 as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, see 
 * http://www.gnu.org/licenses/.
 */

/*
 * Copyright (C) 2009-2014 e-Contract.be BVBA.
 * This file is part of the eID Applet Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package be.fedict.eid.applet.service.signer.ooxml;

import java.util.Comparator;

import org.w3c.dom.Element;

/**
 * Comparator for Relationship DOM elements.
 * 
 * @author Frank Cornelis
 * 
 */
public class RelationshipComparator implements Comparator<Element> {

	public int compare(Element element1, Element element2) {
		String id1 = element1.getAttribute("Id");
		String id2 = element2.getAttribute("Id");
		return id1.compareTo(id2);
	}
}
