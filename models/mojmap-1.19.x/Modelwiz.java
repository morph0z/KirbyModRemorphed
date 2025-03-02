// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelwiz<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "wiz"),
			"main");
	private final ModelPart hat;

	public Modelwiz(ModelPart root) {
		this.hat = root.getChild("hat");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hat = partdefinition.addOrReplaceChild("hat",
				CubeListBuilder.create().texOffs(34, 16)
						.addBox(-8.0F, -1.0F, -8.0F, 16.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 13)
						.addBox(-8.0F, -1.0F, 6.0F, 16.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 40)
						.addBox(-8.0F, -1.0F, -6.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
						.addBox(6.0F, -1.0F, -6.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(22, 11)
						.addBox(-6.0F, -15.0F, -5.0F, 1.0F, 15.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -15.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(5.0F, -15.0F, -5.0F, 1.0F, 15.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(26, 36)
						.addBox(-6.0F, -15.0F, 5.0F, 12.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-6.0F, -15.0F, -6.0F, 12.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 52)
						.addBox(-12.0F, -3.0F, 3.0F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-13.0F, -6.0F, 2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 47)
						.addBox(8.2F, -8.0F, -3.0F, 0.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 50)
						.addBox(8.2F, -6.0F, 2.0F, 0.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.2F, -6.0F, 2.0F, 0.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-8.2F, -8.0F, -3.0F, 0.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hat.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(78, 76)
						.addBox(-4.0F, 0.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 38)
						.addBox(1.0F, 0.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hat
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 2.0F, -4.0F, 4.0F, 2.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hat.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(44, 19).addBox(-4.7F, 4.0F, -2.7F, 10.0F, 9.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8606F, 0.7014F, 0.1367F));

		PartDefinition cube_r4 = hat.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(50, 0).addBox(-3.1F, 4.4F, -3.6F, 10.0F, 9.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8136F, -0.4912F, -0.1201F));

		PartDefinition cube_r5 = hat
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(12, 11).addBox(-5.0F, 3.0F, -4.0F, 10.0F, 10.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hat.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(56, 43)
						.addBox(-7.0F, -13.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 28)
						.addBox(-6.0F, -13.0F, -1.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -11.1F, 6.0F, 3.002F, -1.399F, -1.4277F));

		PartDefinition cube_r7 = hat.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(50, 9).addBox(-6.0F, -4.9F, -11.3F, 5.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -11.1F, 6.0F, 1.3876F, -1.399F, -1.4277F));

		PartDefinition cube_r8 = hat.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(30, 6).addBox(-6.0F, -7.2F, -11.7F, 5.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -11.1F, 6.0F, 1.6057F, -1.399F, -1.4277F));

		PartDefinition cube_r9 = hat.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(56, 47)
						.addBox(-1.0F, -13.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-6.0F, -13.0F, -1.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r10 = hat.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(52, 35).addBox(-6.0F, 8.8F, -7.7F, 5.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.8798F, 0.0F, -1.5708F));

		PartDefinition cube_r11 = hat.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(36, 53).addBox(-6.0F, -7.2F, -11.7F, 5.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.3963F, 0.0F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		hat.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}