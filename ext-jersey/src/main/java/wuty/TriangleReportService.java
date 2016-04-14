package wuty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.gson.Gson;

import wuty.vo.ConfigVo;
import wuty.vo.ReportVo;

@Path("/triangleReport")
public class TriangleReportService {

	private static Log logger = LogFactory.getLog(TriangleReportService.class);

	@GET
	@Path("/queryStages")
	public Response queryStages() {
		Map<String, String> stage1 = new HashMap<String, String>();
		stage1.put("value", "stage1");
		
		Map<String, String> stage2 = new HashMap<String, String>();
		stage2.put("value", "stage2");
 
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
		Map<String, String> targetLabel1 = new HashMap<String, String>();
		targetLabel1.put("value", "targetLabel1");
		
		Map<String, String> targetLabel2 = new HashMap<String, String>();
		targetLabel2.put("value", "targetLabel2");
 
		List<Map<String, String>> targetLabels = new ArrayList<Map<String, String>>();
		targetLabels.add(targetLabel1);
		targetLabels.add(targetLabel2);

		Gson gson = new Gson();
		String output = gson.toJson(targetLabels);

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

	@GET
	@Path("/queryReport")
	public Response queryReport() {
		ReportVo report1 = new ReportVo();
		report1.setWaferId("N123456.01");
		report1.setEx("1");
		report1.setEy("1.5");
		report1.setTx("2");
		report1.setTy("2.5");

		ReportVo report2 = new ReportVo();
		report2.setWaferId("N123456.02");
		report2.setEx("5");
		report2.setEy("3");
		report2.setTx("1");
		report2.setTy("4");

		ReportVo report3 = new ReportVo();
		report3.setWaferId("N123456.03");
		report3.setEx("1.1");
		report3.setEy("1.2");
		report3.setTx("1.3");
		report3.setTy("1.4");

		List<ReportVo> reportVos = new ArrayList<ReportVo>();
		reportVos.add(report1);
		reportVos.add(report2);
		reportVos.add(report3);

		Gson gson = new Gson();
		String output = gson.toJson(reportVos);

		return Response.status(200).entity(output).build();
	}
}
