<p:commandLink update=":form:carDetail" oncomplete="PF('carDialog').show()" title="View Detail" styleClass="ui-icon ui-icon-search" style="float:left;margin-right:10px">
  <f:setPropertyActionListener value="#{car}" target="#{dataListView.selectedCar}" />
  <h:outputText value="#{car.brand}, #{car.year}" />
</p:commandLink>
