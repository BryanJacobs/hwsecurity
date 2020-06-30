/*
 * Copyright (C) 2018-2020 Confidential Technologies GmbH
 *
 * You can purchase a commercial license at https://hwsecurity.dev.
 * Buying such a license is mandatory as soon as you develop commercial
 * activities involving this program without disclosing the source code
 * of your own applications.
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.cotech.hw.fido2.internal.ctap2.commands.rawCommand;


import com.google.auto.value.AutoValue;
import de.cotech.hw.fido2.internal.ctap2.Ctap2Command;
import de.cotech.hw.fido2.internal.ctap2.Ctap2ResponseFactory;


@AutoValue
public abstract class RawCtap2Command extends Ctap2Command<RawCtap2Response> {
    public abstract byte[] data();

    public Ctap2ResponseFactory<RawCtap2Response> getResponseFactory() {
        return RawCtap2Response::create;
    }

    public static RawCtap2Command create(byte command, byte[] data) {
        return new AutoValue_RawCtap2Command(command, data);
    }
}