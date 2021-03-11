/*
 * ao-appcluster-dnsonly - Application-level clustering tools to monitor DNS for component states.
 * Copyright (C) 2011, 2016, 2021  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of ao-appcluster-dnsonly.
 *
 * ao-appcluster-dnsonly is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ao-appcluster-dnsonly is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with ao-appcluster-dnsonly.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aoindustries.appcluster.dnsonly;

import com.aoindustries.appcluster.AppClusterConfigurationException;
import com.aoindustries.appcluster.Node;
import com.aoindustries.appcluster.ResourceNode;

/**
 * The node settings for DNS-only synchronization.
 *
 * @author  AO Industries, Inc.
 */
public class DnsOnlyResourceNode extends ResourceNode<DnsOnlyResource, DnsOnlyResourceNode> {

	protected DnsOnlyResourceNode(Node node, DnsOnlyResourceNodeConfiguration resourceNodeConfiguration) throws AppClusterConfigurationException {
		super(node, resourceNodeConfiguration);
	}
}
