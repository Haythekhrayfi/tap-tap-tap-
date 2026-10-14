package org.joda.time.tz;

import com.google.android.material.datepicker.UtcDates;
import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class UTCProvider implements Provider {
    private static final Set<String> AVAILABLE_IDS = Collections.singleton(UtcDates.UTC);

    @Override // org.joda.time.tz.Provider
    public Set<String> getAvailableIDs() {
        return AVAILABLE_IDS;
    }

    @Override // org.joda.time.tz.Provider
    public DateTimeZone getZone(String str) {
        if (UtcDates.UTC.equalsIgnoreCase(str)) {
            return DateTimeZone.UTC;
        }
        return null;
    }
}
