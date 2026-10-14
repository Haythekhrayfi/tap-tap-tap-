package com.jakewharton.processphoenix;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ProcessPhoenix extends Activity {
    public static void a(Context context) {
        Intent[] intentArr = new Intent[1];
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addFlags(268468224);
        intent.addCategory("android.intent.category.DEFAULT");
        String packageName = context.getPackageName();
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo.packageName.equals(packageName)) {
                intent.setComponent(new ComponentName(packageName, activityInfo.name));
                intentArr[0] = intent;
                Intent intent2 = new Intent(context, (Class<?>) ProcessPhoenix.class);
                intent2.addFlags(268435456);
                intent2.putParcelableArrayListExtra("phoenix_restart_intents", new ArrayList<>(Arrays.asList(intentArr)));
                context.startActivity(intent2);
                ((Activity) context).finish();
                Runtime.getRuntime().exit(0);
                return;
            }
        }
        throw new IllegalStateException(j.a("Unable to determine default activity for ", packageName, ". Does an activity specify the DEFAULT category in its intent filter?"));
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("phoenix_restart_intents");
        startActivities((Intent[]) parcelableArrayListExtra.toArray(new Intent[parcelableArrayListExtra.size()]));
        finish();
        Runtime.getRuntime().exit(0);
    }
}
