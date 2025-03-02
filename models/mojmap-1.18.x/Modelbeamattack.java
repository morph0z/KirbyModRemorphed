// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbeamattack<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "beamattack"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart BEAMATTCK;

	public Modelbeamattack(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.BEAMATTCK = root.getChild("BEAMATTCK");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(32, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(0, 0)
						.addBox(-1.0F, -10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 32).addBox(
				-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 32)
				.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(48, 48)
				.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 32)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 48)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition BEAMATTCK = partdefinition.addOrReplaceChild("BEAMATTCK",
				CubeListBuilder.create().texOffs(0, 35)
						.addBox(-5.0F, -9.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-5.0F, -11.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-5.0F, -11.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-5.0F, -12.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(1.0F, -11.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-2.0F, -11.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 35)
						.addBox(-4.0F, -13.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 35)
						.addBox(1.0F, -13.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = BEAMATTCK.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(37, 53).addBox(2.0F, -27.0F, -32.0F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r2 = BEAMATTCK.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(47, 3).addBox(1.0F, -26.75F, -34.25F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r3 = BEAMATTCK.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(8, 0).addBox(-4.0F, -33.75F, -29.25F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r4 = BEAMATTCK.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(10, 49).addBox(-3.0F, -35.75F, -23.75F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r5 = BEAMATTCK.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 57).addBox(-4.0F, -40.0F, -7.0F, 3.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r6 = BEAMATTCK.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(54, 56).addBox(1.0F, -39.0F, -9.0F, 3.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r7 = BEAMATTCK.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 35)
						.addBox(-5.0F, -35.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-2.0F, -35.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(1.0F, -35.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-2.0F, -35.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(1.0F, -35.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-5.0F, -35.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-5.0F, -36.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r8 = BEAMATTCK.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 35)
						.addBox(-2.0F, -35.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(1.0F, -35.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-5.0F, -35.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-5.0F, -35.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-5.0F, -36.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r9 = BEAMATTCK.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 35)
						.addBox(-5.0F, -35.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-5.0F, -35.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-5.0F, -36.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BEAMATTCK.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.BEAMATTCK.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.BEAMATTCK.xRot = headPitch / (180F / (float) Math.PI);
	}
}