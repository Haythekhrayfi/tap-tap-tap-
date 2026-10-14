package com.applovin.impl.a.a.b.a;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.p;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class c extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.a.a.a.a f8292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f8293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f8294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Button f8295d;

    private void a() {
        p pVar = new p();
        pVar.a(this.f8293b.ac().a(this.f8292a));
        String strB = this.f8293b.ac().b(this.f8292a.c());
        if (strB != null) {
            pVar.a("\nBid Response Preview:\n");
            pVar.a(strB);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f8294c = textView;
        textView.setText(pVar.toString());
        this.f8294c.setTextColor(-16777216);
    }

    public void a(com.applovin.impl.a.a.a.a aVar, o oVar) {
        this.f8292a = aVar;
        this.f8293b = oVar;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(this.f8292a.a() + " - " + this.f8292a.b());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        a();
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f8295d = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.a.a.b.a.c.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                c.this.f8293b.ac().a(c.this.f8292a, c.this, true);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f8293b.ac().a(this.f8292a, this, false);
        return true;
    }
}
