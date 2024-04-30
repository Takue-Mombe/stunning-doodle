package com.example.application.views.dashboard;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@PageTitle("Dashboard")
@Route(value = "my-view3", layout = MainLayout.class)
@AnonymousAllowed
@Uses(Icon.class)
public class DashboardView extends Composite<VerticalLayout> {

    public DashboardView() {
        Hr hr = new Hr();
        Button buttonPrimary = new Button();
        Button buttonPrimary2 = new Button();
        Button buttonPrimary3 = new Button();
        Button buttonPrimary4 = new Button();
        getContent().setWidth("100%");
        getContent().setHeight("500px");
        buttonPrimary.setText("Personal Information");
        buttonPrimary.getStyle().set("flex-grow", "1");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary2.setText("Medical Profile");
        buttonPrimary2.getStyle().set("flex-grow", "1");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary3.setText("Manage Appointments");
        buttonPrimary3.getStyle().set("flex-grow", "1");
        buttonPrimary3.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary4.setText("Payment history");
        buttonPrimary4.getStyle().set("flex-grow", "1");
        buttonPrimary4.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(hr);
        getContent().add(buttonPrimary);
        getContent().add(buttonPrimary2);
        getContent().add(buttonPrimary3);
        getContent().add(buttonPrimary4);
    }
}
