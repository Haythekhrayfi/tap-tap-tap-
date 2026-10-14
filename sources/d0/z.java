package d0;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f28626a = new Object();

    public static f0[] a(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        f0[] f0VarArr = new f0[bundleArr.length];
        for (int i10 = 0; i10 < bundleArr.length; i10++) {
            Bundle bundle = bundleArr[i10];
            ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
            HashSet hashSet = new HashSet();
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next());
                }
            }
            f0VarArr[i10] = new f0(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
        }
        return f0VarArr;
    }

    public static Bundle[] b(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    public static Bundle[] c(f0[] f0VarArr) {
        if (f0VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[f0VarArr.length];
        for (int i10 = 0; i10 < f0VarArr.length; i10++) {
            f0 f0Var = f0VarArr[i10];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", f0Var.f28505a);
            bundle.putCharSequence("label", f0Var.f28506b);
            bundle.putCharSequenceArray("choices", f0Var.f28507c);
            bundle.putBoolean("allowFreeFormInput", f0Var.f28508d);
            bundle.putBundle("extras", f0Var.f28510f);
            Set<String> set = f0Var.f28511g;
            if (set != null && !set.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i10] = bundle;
        }
        return bundleArr;
    }
}
