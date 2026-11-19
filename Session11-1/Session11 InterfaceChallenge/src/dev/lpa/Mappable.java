package dev.lpa;

enum Geometry{LINE, POINT, POLYGON}

enum Color{BLACK, BLUE, GREEN, ORANGE, RED}

enum PointMarker {CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE};

enum LineMarker {DASHED, DOTTED, SOLID}

public interface Mappable {

    String JSON_PROPERY = """
            "properties: {%s}""";

    String getLabel();
    Geometry getShape();
    String getMarker();

     default String toJSON() {
         return String.format("""
                 "type": "%s", "label: "%s", "marker": "%s" """
                 .formatted(getShape(), getLabel(), getMarker()));
     }

     static void mapIt(Mappable mapple){
         System.out.println(JSON_PROPERY.formatted(mapple.toJSON()));
     }
}
