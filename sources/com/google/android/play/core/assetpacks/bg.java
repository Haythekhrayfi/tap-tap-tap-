package com.google.android.play.core.assetpacks;

import androidx.fragment.app.d0;
import com.google.android.play.core.assetpacks.model.AssetPackStorageMethod;

/* JADX INFO: loaded from: classes2.dex */
final class bg extends AssetPackLocation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11925c;

    public bg(int i10, String str, String str2) {
        this.f11923a = i10;
        this.f11924b = str;
        this.f11925c = str2;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    public final String assetsPath() {
        return this.f11925c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackLocation) {
            AssetPackLocation assetPackLocation = (AssetPackLocation) obj;
            if (this.f11923a == assetPackLocation.packStorageMethod() && ((str = this.f11924b) != null ? str.equals(assetPackLocation.path()) : assetPackLocation.path() == null)) {
                String str2 = this.f11925c;
                String strAssetsPath = assetPackLocation.assetsPath();
                if (str2 != null ? str2.equals(strAssetsPath) : strAssetsPath == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f11923a ^ 1000003) * 1000003;
        String str = this.f11924b;
        int iHashCode = (i10 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f11925c;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    @AssetPackStorageMethod
    public final int packStorageMethod() {
        return this.f11923a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackLocation
    public final String path() {
        return this.f11924b;
    }

    public final String toString() {
        int i10 = this.f11923a;
        String str = this.f11924b;
        String str2 = this.f11925c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb2.append("AssetPackLocation{packStorageMethod=");
        sb2.append(i10);
        sb2.append(", path=");
        sb2.append(str);
        return d0.a(sb2, ", assetsPath=", str2, "}");
    }
}
