// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbeamjjjjj<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "beamjjjjj"), "main");
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;

	public Modelbeamjjjjj(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.bone3 = root.getChild("bone3");
		this.bone4 = root.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 20)
						.addBox(-3.0F, -13.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, -12.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-2.0F, -14.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-2.0F, -7.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-2.0F, -12.0F, -4.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-2.0F, -12.0F, 3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.0F, 23.0F, 0.0F));

		PartDefinition cube_r1 = bone
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(3.0F, -12.0F, -2.0F, 1.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 20)
						.addBox(-3.0F, -13.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, -12.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-2.0F, -14.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-2.0F, -7.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-2.0F, -12.0F, -4.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-2.0F, -12.0F, 3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(20.0F, 25.0F, 0.0F));

		PartDefinition cube_r2 = bone2
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 0).addBox(3.0F, -12.0F, -2.0F, 1.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(0, 20)
						.addBox(-3.0F, -13.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, -12.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-2.0F, -14.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-2.0F, -7.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-2.0F, -12.0F, -4.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-2.0F, -12.0F, 3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r3 = bone3
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(0, 0).addBox(3.0F, -12.0F, -2.0F, 1.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(0, 20)
						.addBox(-3.0F, -13.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, -12.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-2.0F, -14.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-2.0F, -7.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-2.0F, -12.0F, -4.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 0)
						.addBox(-2.0F, -12.0F, 3.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-11.0F, 26.0F, 0.0F));

		PartDefinition cube_r4 = bone4
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(0, 0).addBox(3.0F, -12.0F, -2.0F, 1.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}