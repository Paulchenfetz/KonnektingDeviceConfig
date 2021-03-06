/*
 * Copyright (C) 2016 Alexander Christian <alex(at)root1.de>. All rights reserved.
 * 
 * This file is part of KONNEKTING DeviceConfig.
 *
 *   KONNEKTING DeviceConfig is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   KONNEKTING DeviceConfig is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with KONNEKTING DeviceConfig.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.konnekting.deviceconfig.utils;

/**
 *
 * @author achristian
 */
public class ReadableValue2Bytes {

    public synchronized byte[] convertINT8(byte v) {
        return new byte[]{v};
    }

    public synchronized byte[] convertUINT8(short v) {
        return new byte[]{(byte)((v) & 0xFF)};
    }

    public synchronized byte[] convertINT16(short v) {
        byte b0 = (byte)((v >>> 8) & 0xFF);
        byte b1 = (byte)((v >>> 0) & 0xFF);
        return new byte[]{b0, b1};
    }

    public synchronized byte[] convertUINT16(int v) {
        byte b0 = (byte)(v >>>  8);
        byte b1 = (byte)(v >>>  0);
        return new byte[]{b0, b1};
    }

    public synchronized byte[] convertINT32(int v) {
        byte b0 = (byte)((v >>> 24) & 0xFF);
        byte b1 = (byte)((v >>> 16) & 0xFF);
        byte b2 = (byte)((v >>> 8) & 0xFF);
        byte b3 = (byte)((v >>> 0) & 0xFF);
        return new byte[]{b0, b1, b2, b3};
    }

    public synchronized byte[] convertUINT32(long v) {
        byte b0 = (byte)(v >>> 24);
        byte b1 = (byte)(v >>> 16);
        byte b2 = (byte)(v >>>  8);
        byte b3 = (byte)(v >>>  0);
        return new byte[]{b0, b1, b2, b3};
    }
    
    public synchronized byte[] convertFLOAT32(float v) {
        
        int floatToIntBits = Float.floatToIntBits(v);
        
        byte b0 = (byte)(floatToIntBits >>> 24);
        byte b1 = (byte)(floatToIntBits >>> 16);
        byte b2 = (byte)(floatToIntBits >>>  8);
        byte b3 = (byte)(floatToIntBits >>>  0);
        return new byte[]{b0, b1, b2, b3};
    }
    
}
