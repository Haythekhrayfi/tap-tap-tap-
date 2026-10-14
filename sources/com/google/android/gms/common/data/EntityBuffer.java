package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa;
    private ArrayList<Integer> zab;

    @KeepForSdk
    public EntityBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            if (!this.zaa) {
                int count = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                ArrayList<Integer> arrayList = new ArrayList<>();
                this.zab = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                    String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                    for (int i10 = 1; i10 < count; i10++) {
                        int windowIndex = this.mDataHolder.getWindowIndex(i10);
                        String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i10, windowIndex);
                        if (string2 == null) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(primaryDataMarkerColumn).length() + 78);
                            sb2.append("Missing value for markerColumn: ");
                            sb2.append(primaryDataMarkerColumn);
                            sb2.append(", at row: ");
                            sb2.append(i10);
                            sb2.append(", for window: ");
                            sb2.append(windowIndex);
                            throw new NullPointerException(sb2.toString());
                        }
                        if (!string2.equals(string)) {
                            this.zab.add(Integer.valueOf(i10));
                            string = string2;
                        }
                    }
                }
                this.zaa = true;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public final T get(int i10) {
        zab();
        int iZaa = zaa(i10);
        int i11 = 0;
        if (i10 >= 0 && i10 != this.zab.size()) {
            int count = (i10 == this.zab.size() + (-1) ? ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount() : this.zab.get(i10 + 1).intValue()) - this.zab.get(i10).intValue();
            if (count == 1) {
                int iZaa2 = zaa(i10);
                int windowIndex = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(iZaa2);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, iZaa2, windowIndex) != null) {
                    i11 = 1;
                }
            } else {
                i11 = count;
            }
        }
        return getEntry(iZaa, i11);
    }

    @KeepForSdk
    public String getChildDataMarkerColumn() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        zab();
        return this.zab.size();
    }

    @KeepForSdk
    public abstract T getEntry(int i10, int i11);

    @KeepForSdk
    public abstract String getPrimaryDataMarkerColumn();

    public final int zaa(int i10) {
        if (i10 >= 0 && i10 < this.zab.size()) {
            return this.zab.get(i10).intValue();
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("Position ");
        sb2.append(i10);
        sb2.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb2.toString());
    }
}
