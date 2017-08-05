package com.digitaldan.jomnilinkII.MessageTypes.properties;

/**
*  Copyright (C) 2009  Dan Cunningham
*
* This program is free software; you can redistribute it and/or
* modify it under the terms of the GNU General Public License
* as published by the Free Software Foundation, version 2
* of the License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, write to the Free Software
* Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/

import com.digitaldan.jomnilinkII.MessageTypes.ObjectProperties;
import com.digitaldan.jomnilinkII.MessageTypes.statuses.ZoneStatus;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ZoneProperties extends ObjectProperties {
	private final int status;
	private final int loop;
	private final int zoneType;
	private final int area;
	private final int options;

	@Builder
	private ZoneProperties(int number, int status, int loop, int zoneType, int area, int options, String name) {
		super(OBJ_TYPE_ZONE, number, name);
		this.status = status;
		this.loop = loop;
		this.zoneType = zoneType;
		this.area = area;
		this.options = options;
	}

}
