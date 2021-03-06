/*
 * Copyright (C) 2015 Alexander Christian <alex(at)root1.de>. All rights reserved.
 * 
 * This file is part of slicKnx.
 *
 *   slicKnx is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   slicKnx is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with slicKnx.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.konnekting.mgnt.protocol0x00;

import static de.konnekting.mgnt.protocol0x00.ProgProtocol0x00.PROTOCOL_VERSION;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author achristian
 */
abstract class ProgMessage {
    
    protected Logger log = LoggerFactory.getLogger(ProgMessage.class);
    protected final byte[] data;

    public ProgMessage(byte[] message) {
        this.data = message;
    }
    
    public ProgMessage(byte type) {
        data = new byte[14];
        data[0] = PROTOCOL_VERSION;
        data[1] = type;
        for (int i = 2; i < data.length; i++) {
            data[i] = 0x00;
        }
    }

    public byte getType() {
        return data[1];
    }

    public byte getProtocolversion() {
        return data[0];
    }

    @Override
    public String toString() {
        return String.format("ProgMessage[%02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x]",
            data[0],
            data[1],
            data[2],
            data[3],
            data[4],
            data[5],
            data[6],
            data[7],
            data[8],
            data[9],
            data[10],
            data[11],
            data[12],
            data[13]);
    }
    
}
