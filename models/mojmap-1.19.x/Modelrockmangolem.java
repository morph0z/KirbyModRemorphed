// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelrockmangolem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "rockmangolem"), "main");
	private final ModelPart bb_main;

	public Modelrockmangolem(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, -15.0F, -7.0F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-6.0F, -22.0F, -6.0F, 12.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(7.5F, -13.25F, -6.75F, 5.0F, 5.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-1.0F, 0.0F, 5.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 7).addBox(-11.0F, -13.5F, -4.0F, 4.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 5.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 28).addBox(-17.0F, -14.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2F, -23.5F, 8.6F, -0.0411F, -0.9154F, -2.9424F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 32).addBox(-18.2F, -14.0F, 3.4F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2F, -23.5F, 8.6F, -0.0652F, -1.1769F, -2.9147F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 46).addBox(-15.0F, -14.0F, -1.0F, 4.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -23.0F, 5.0F, 0.0F, -0.6109F, -3.0107F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(35, 28).addBox(-16.1F, -12.0F, 7.3F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9F, -23.0F, 7.5F, 0.0F, -1.3526F, -3.0107F));

		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(35, 32).addBox(-17.0F, -12.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9F, -23.0F, 7.5F, 0.0F, -0.829F, -3.0107F));

		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(41, 30).addBox(-15.75F, -10.0F, 8.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -23.0F, 9.0F, 0.0F, -1.4835F, -3.0107F));

		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(42, 0).addBox(-17.0F, -10.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -23.0F, 9.0F, 0.0F, -0.9163F, -3.0107F));

		PartDefinition cube_r10 = bb_main.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(42, 4).addBox(-15.75F, -10.0F, 8.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 9.0F, 0.0F, -1.4835F, 0.0F));

		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(24, 46).addBox(-18.2F, -14.0F, 3.4F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.5F, 9.0F, -0.0652F, -1.1769F, 0.096F));

		PartDefinition cube_r12 = bb_main.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(47, 28).addBox(-16.1F, -12.0F, 7.3F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 9.0F, 0.0F, -1.3526F, 0.0F));

		PartDefinition cube_r13 = bb_main.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(32, 47).addBox(-17.0F, -10.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 9.0F, 0.0F, -0.9163F, 0.0F));

		PartDefinition cube_r14 = bb_main
				.addOrReplaceChild("cube_r14",
						CubeListBuilder.create().texOffs(40, 47).addBox(-17.0F, -12.0F, -1.0F, 2.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-1.0F, 0.0F, 9.0F, 0.0F, -0.829F, 0.0F));

		PartDefinition cube_r15 = bb_main.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(48, 47).addBox(-17.0F, -14.0F, -1.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 0.5F, 9.0F, -0.0411F, -0.9154F, 0.0683F));

		PartDefinition cube_r16 = bb_main.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(12, 46).addBox(-15.0F, -14.0F, -1.0F, 4.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 5.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r17 = bb_main
				.addOrReplaceChild("cube_r17",
						CubeListBuilder.create().texOffs(35, 35).addBox(-1.0F, -1.0F, -13.0F, 5.0F, 1.0F, 11.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r18 = bb_main
				.addOrReplaceChild("cube_r18",
						CubeListBuilder.create().texOffs(42, 0).addBox(-4.0F, -1.0F, -13.0F, 5.0F, 1.0F, 11.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}