/**
 * Oshi (https://github.com/oshi/oshi)
 *
 * Copyright (c) 2010 - 2017 The Oshi Project Team
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Maintainers:
 * dblock[at]dblock[dot]org
 * widdis[at]gmail[dot]com
 * enrico.bianchi[at]gmail[dot]com
 *
 * Contributors:
 * https://github.com/oshi/oshi/graphs/contributors
 */
package oshi.hardware;

import java.io.Serializable;

import java8.lang.FunctionalInterface;

/**
 * Networks refers to network interfaces installed in the machine.
 *
 * @author enrico[dot]bianchi[at]gmail[dot]com
 */
@FunctionalInterface
public interface Networks extends Serializable {

    /**
     * Get network interfaces on this machine
     *
     * @return Array of {@link NetworkIF} objects
     */
    NetworkIF[] getNetworks();
}
