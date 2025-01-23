package org.eclipse.tracecompass.internal.provisional.perfetto.core.trace;

import org.eclipse.tracecompass.internal.perfetto.protos.TraceOuterClass;
import org.eclipse.tracecompass.internal.perfetto.protos.TracePacketOuterClass;
import org.eclipse.tracecompass.internal.perfetto.protos.TrackEventOuterClass;
import org.eclipse.tracecompass.internal.perfetto.protos.DebugAnnotationOuterClass.DebugAnnotation;
import org.eclipse.tracecompass.internal.perfetto.protos.DebugAnnotationOuterClass.DebugAnnotationName;
import org.eclipse.tracecompass.internal.perfetto.protos.InternedDataOuterClass;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.InvalidProtocolBufferException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PerfettoTraceReader {
//    public static void main(String[] args) {
//       String traceFilePath = "src/main/resources/712603_output.pftrace";
//        String filePath = "output.txt";
//
//        try (FileWriter writer = new FileWriter(filePath)) {
//        	TraceOuterClass.Trace trace = readTraceFile(traceFilePath);
//            System.out.println("Parsed trace file successfully.");
//
//            List<DebugAnnotationName> extraNames = null;
//            boolean flag = true;
//
//            for (TracePacketOuterClass.TracePacket packet : trace.getPacketList()) {
//            	if(packet.hasTrackEvent()) {
//            		TrackEventOuterClass.TrackEvent track_event = packet.getTrackEvent();
//            		InternedDataOuterClass.InternedData data = packet.getInternedData();
//            		String content = "";
//            		if(track_event.getType().equals(TrackEventOuterClass.TrackEvent.Type.TYPE_SLICE_BEGIN)) {
//            			if(flag) {extraNames = data.getDebugAnnotationNamesList(); flag = false;}
//            			String name = track_event.getName();
//            			if(name.isEmpty() && data.getEventNamesCount() > 0)
//            				name = data.getEventNames(0).getName();
//            			String extra = "None";
//            			if(track_event.getDebugAnnotationsCount() > 0) {
//            				extra = "";
//            				for (DebugAnnotation item :  track_event.getDebugAnnotationsList()) {
//            					String itemName = getEventName(item.getNameIid(), extraNames);
//            					String itemValue = "N/A";
//            					switch (item.getValueCase()) {
//            						case STRING_VALUE:
//            							itemValue = item.getStringValue();
//            							break;
//            						case BOOL_VALUE:
//            							itemValue = item.getBoolValue() + "";
//            							break;
//            						case DOUBLE_VALUE:
//            							itemValue = item.getDoubleValue() + "";
//            							break;
//            						case INT_VALUE:
//            							itemValue = item.getIntValue() + "";
//            							break;
//            						case LEGACY_JSON_VALUE:
//            							itemValue = item.getLegacyJsonValue();
//            							break;
//            						case NESTED_VALUE:
//            							itemValue = item.getNestedValue().toString();
//            							break;
//            						case POINTER_VALUE:
//            							itemValue = item.getPointerValue() + "";
//            							break;
//            						case STRING_VALUE_IID:
//            							itemValue = item.getStringValueIid() + "";
//            							break;
//            						case UINT_VALUE:
//            							itemValue = item.getUintValue() + "";
//            							break;
//            						default:
//            					}
//            					extra = extra + itemName + ": " + itemValue + ", ";
//            				}
//            			}
//            			content ="Trace Packet: " + name + "(" + extra.substring(0, extra.length()-2) + ")" + ", Start_Timestamp: " + packet.getTimestamp() + ", ";
//            		} else if (track_event.getType().equals(TrackEventOuterClass.TrackEvent.Type.TYPE_SLICE_END))
//            			content ="End_Timestamp: " + packet.getTimestamp() + "\n";
//            		writer.write(content);
//            	}
//            }
//        } catch (Exception e) {
//            System.err.println("Error reading trace file: " + e.getMessage());
//        }
//    }
//
//    private static String getEventName(long id, List<DebugAnnotationName> names) {
//    	for (DebugAnnotationName name : names) {
//    		if(name.getIid() == id) {
//    			return name.getName();
//    		}
//    	}
//    	return "";
//    }
//
//    private static TraceOuterClass.Trace readTraceFile(String filePath) throws IOException {
//        File file = new File(filePath);
//
//        try (FileInputStream fis = new FileInputStream(file)) {
//            CodedInputStream codedInput = CodedInputStream.newInstance(fis);
//            return TraceOuterClass.Trace.parseFrom(codedInput);
//        } catch (InvalidProtocolBufferException e) {
//            throw new IOException("Protobuf parsing failed: " + e.getMessage(), e);
//        }
//    }
}
