/*
 * Copyright (C) 2011 Skrilax_CZ
 * Decompilation of Motorola Usb.apk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.motorola.usb;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class UsbReceiver extends BroadcastReceiver
{
	public void onReceive(Context context, Intent intent)
	{
		String action = intent.getAction();

		Log.d("UsbReceiver", "onReceive(), received intent -- " + action);
		
		if (action.equals("android.intent.action.BOOT_COMPLETED"))
			context.startService( new Intent("com.motorola.intent.action.USB_LAUNCH_USBSERVICE"));
		
	}
}
