package wuty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.gson.Gson;

import wuty.vo.ConfigVo;

@Path("/triangleReport")
public class TriangleReportService {

	private static Log logger = LogFactory.getLog(TriangleReportService.class);

	@GET
	@Path("/queryStages")
	public Response queryStages() {
		Map<String, String> stage1 = new HashMap<String, String>();
		stage1.put("value", "stage1");
		
		Map<String, String> stage2 = new HashMap<String, String>();
		stage1.put("value", "stage2");
 
		List<Map<String, String>> stages = new ArrayList<Map<String, String>>();
		stages.add(stage1);
		stages.add(stage2);

		Gson gson = new Gson();
		String output = gson.toJson(stages);

		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/queryTargetLabels")
	public Response queryTargetLabels() {
		Map<String, String> stage1 = new HashMap<String, String>();
		stage1.put("value", "targetLabel1");
		
		Map<String, String> stage2 = new HashMap<String, String>();
		stage1.put("value", "targetLabel2");
 
		List<Map<String, String>> stages = new ArrayList<Map<String, String>>();
		stages.add(stage1);
		stages.add(stage2);

		Gson gson = new Gson();
		String output = gson.toJson(stages);

		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/queryConfigs")
	public Response queryConfig(
			@QueryParam("stage") String stage,
			@QueryParam("targetLabel") String targetLabel) {

		logger.info("stage[" + stage + "], targetLabel[" + targetLabel + "]");

		ConfigVo cnfg1 = new ConfigVo();
		cnfg1.setConfigId("congfig1");
		cnfg1.setStageId("stage1");
		cnfg1.setTargetLabel("targetLabel1");
		cnfg1.setOperator("+");
		cnfg1.setCurFlag("Y");
		cnfg1.setUpdateUser("user1");
		cnfg1.setUpdateTime("2016-04-12 00:39:00");


		List<ConfigVo> configs = new ArrayList<ConfigVo>();
		configs.add(cnfg1);

		Gson gson = new Gson();
		String output = gson.toJson(configs);

		return Response.status(200).entity(output).build();
	}
}
