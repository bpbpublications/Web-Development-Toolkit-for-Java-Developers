<p:dataList value="#{dataListView.cars1}" var="car" type="ordered">
  <f:facet name="header">
    Basic
  </f:facet>
  #{car.brand}, #{car.year}
</p:dataList>
