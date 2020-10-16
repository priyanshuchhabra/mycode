<mxfile host="app.diagrams.net" modified="2020-10-16T16:44:03.933Z" agent="5.0 (Windows)" etag="SjmJvBHlZUU8dyehXPRG" version="13.8.0" type="github">
  <diagram id="juxH0KklmC_FeufzMbA_" name="Page-1">
    <mxGraphModel dx="1600" dy="925" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="850" pageHeight="1100" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="7-eWuzgDtdlLCh7WXtTW-1" value="&lt;font style=&quot;font-size: 13px&quot;&gt;Patient Object&lt;/font&gt;" style="shape=note;whiteSpace=wrap;html=1;size=14;verticalAlign=top;align=left;spacingTop=-6;" vertex="1" parent="1">
          <mxGeometry x="50" y="230" width="100" height="30" as="geometry" />
        </mxCell>
        <mxCell id="7-eWuzgDtdlLCh7WXtTW-4" value="" style="ellipse;html=1;shape=startState;fillColor=#000000;strokeColor=#ff0000;" vertex="1" parent="1">
          <mxGeometry x="260" y="200" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="7-eWuzgDtdlLCh7WXtTW-5" value="" style="edgeStyle=orthogonalEdgeStyle;html=1;verticalAlign=bottom;endArrow=open;endSize=8;strokeColor=#ff0000;" edge="1" source="7-eWuzgDtdlLCh7WXtTW-4" parent="1">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="275" y="290" as="targetPoint" />
            <Array as="points">
              <mxPoint x="275" y="290" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="7-eWuzgDtdlLCh7WXtTW-7" value="Meet Doctor" style="swimlane;childLayout=stackLayout;horizontal=1;startSize=30;horizontalStack=0;rounded=1;fontSize=14;fontStyle=0;strokeWidth=2;resizeParent=0;resizeLast=1;shadow=0;dashed=0;align=center;" vertex="1" parent="1">
          <mxGeometry x="500" y="300" width="230" height="120" as="geometry" />
        </mxCell>
        <mxCell id="7-eWuzgDtdlLCh7WXtTW-8" value="do/Doctor checks&#xa;do/Tell Problem&#xa;do/Undergo Operation&#xa;do/Perform Tasks&#xa;exit/Doctor Prescribe Medicines/Test&#xa;" style="align=left;strokeColor=none;fillColor=none;spacingLeft=4;fontSize=13;verticalAlign=top;resizable=0;rotatable=0;part=1;" vertex="1" parent="7-eWuzgDtdlLCh7WXtTW-7">
          <mxGeometry y="30" width="230" height="90" as="geometry" />
        </mxCell>
        <mxCell id="7-eWuzgDtdlLCh7WXtTW-12" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=0;exitDx=0;exitDy=0;entryX=1;entryY=0.25;entryDx=0;entryDy=0;" edge="1" parent="7-eWuzgDtdlLCh7WXtTW-7" source="7-eWuzgDtdlLCh7WXtTW-7" target="7-eWuzgDtdlLCh7WXtTW-8">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="7-eWuzgDtdlLCh7WXtTW-9" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;entryX=0;entryY=0.5;entryDx=0;entryDy=0;" edge="1" parent="1" source="7-eWuzgDtdlLCh7WXtTW-3" target="7-eWuzgDtdlLCh7WXtTW-7">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="7-eWuzgDtdlLCh7WXtTW-10" value="Get Appointment" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;" vertex="1" parent="1">
          <mxGeometry x="375" y="360" width="100" height="20" as="geometry" />
        </mxCell>
        <mxCell id="7-eWuzgDtdlLCh7WXtTW-2" value="Patient Registration" style="swimlane;childLayout=stackLayout;horizontal=1;startSize=30;horizontalStack=0;rounded=1;fontSize=14;fontStyle=0;strokeWidth=2;resizeParent=0;resizeLast=1;shadow=0;dashed=0;align=center;" vertex="1" parent="1">
          <mxGeometry x="195" y="290" width="160" height="80" as="geometry" />
        </mxCell>
        <mxCell id="7-eWuzgDtdlLCh7WXtTW-3" value="entry/Enter Patient Details&#xa;do/Generate Patient id&#xa; " style="align=left;strokeColor=none;fillColor=none;spacingLeft=4;fontSize=13;verticalAlign=top;resizable=0;rotatable=0;part=1;" vertex="1" parent="7-eWuzgDtdlLCh7WXtTW-2">
          <mxGeometry y="30" width="160" height="50" as="geometry" />
        </mxCell>
        <mxCell id="7-eWuzgDtdlLCh7WXtTW-13" value="Show report to Doctor" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;" vertex="1" parent="1">
          <mxGeometry x="620" y="260" width="130" height="20" as="geometry" />
        </mxCell>
        <mxCell id="7-eWuzgDtdlLCh7WXtTW-15" value="&lt;font style=&quot;font-size: 13px&quot;&gt;Patient Object Released&lt;/font&gt;" style="rounded=1;arcSize=10;whiteSpace=wrap;html=1;align=center;" vertex="1" parent="1">
          <mxGeometry x="340" y="510" width="140" height="50" as="geometry" />
        </mxCell>
        <mxCell id="7-eWuzgDtdlLCh7WXtTW-16" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0;exitY=1;exitDx=0;exitDy=0;" edge="1" parent="1" source="7-eWuzgDtdlLCh7WXtTW-8" target="7-eWuzgDtdlLCh7WXtTW-15">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="7-eWuzgDtdlLCh7WXtTW-17" value="Issue of Discharge" style="text;html=1;align=center;verticalAlign=middle;resizable=0;points=[];autosize=1;" vertex="1" parent="1">
          <mxGeometry x="410" y="470" width="110" height="20" as="geometry" />
        </mxCell>
        <mxCell id="7-eWuzgDtdlLCh7WXtTW-18" value="" style="ellipse;html=1;shape=endState;fillColor=#000000;strokeColor=#ff0000;fontSize=13;" vertex="1" parent="1">
          <mxGeometry x="395" y="650" width="30" height="30" as="geometry" />
        </mxCell>
        <mxCell id="7-eWuzgDtdlLCh7WXtTW-20" value="" style="edgeStyle=orthogonalEdgeStyle;html=1;verticalAlign=bottom;endArrow=open;endSize=8;strokeColor=#ff0000;" edge="1" parent="1">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="275" y="289.9999999999999" as="targetPoint" />
            <mxPoint x="275.0000000000002" y="230" as="sourcePoint" />
            <Array as="points">
              <mxPoint x="275" y="290" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="7-eWuzgDtdlLCh7WXtTW-21" value="" style="edgeStyle=orthogonalEdgeStyle;html=1;verticalAlign=bottom;endArrow=open;endSize=8;strokeColor=#ff0000;entryX=0.5;entryY=0;entryDx=0;entryDy=0;exitX=0.5;exitY=1;exitDx=0;exitDy=0;" edge="1" parent="1" source="7-eWuzgDtdlLCh7WXtTW-15" target="7-eWuzgDtdlLCh7WXtTW-18">
          <mxGeometry relative="1" as="geometry">
            <mxPoint x="285" y="299.9999999999999" as="targetPoint" />
            <mxPoint x="410" y="570" as="sourcePoint" />
            <Array as="points" />
          </mxGeometry>
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>
