package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.inscode.autoclicker.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final Context Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ArrayAdapter f2276a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Spinner f2277b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f2278c0;

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (i10 >= 0) {
                String string = DropDownPreference.this.V[i10].toString();
                if (string.equals(DropDownPreference.this.W)) {
                    return;
                }
                Objects.requireNonNull(DropDownPreference.this);
                DropDownPreference.this.L(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context) {
        this(context, null);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.dropdownPreferenceStyle);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f2278c0 = new a();
        this.Z = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f2276a0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.U;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.f2276a0.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public void m() {
        super.m();
        ArrayAdapter arrayAdapter = this.f2276a0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void q(m mVar) {
        Spinner spinner = (Spinner) mVar.itemView.findViewById(R.id.spinner);
        this.f2277b0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f2276a0);
        this.f2277b0.setOnItemSelectedListener(this.f2278c0);
        Spinner spinner2 = this.f2277b0;
        String str = this.W;
        CharSequence[] charSequenceArr = this.V;
        int i10 = -1;
        if (str != null && charSequenceArr != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    i10 = length;
                    break;
                }
            }
        }
        spinner2.setSelection(i10);
        super.q(mVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void r() {
        this.f2277b0.performClick();
    }
}
